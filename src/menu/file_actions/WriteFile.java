package menu.file_actions;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * ���� ���������� ��������� �� FileCreate. ����� �� ��������� �� ������� ��� ����.
 */
public class WriteFile extends FileCreate {
    /**
     * fileWriter ������������ ���� � ������� �� ��������� �� ����� �� �������� ��� ����.
     */
    private FileWriter fileWriter;

    /**
     * pathName ������������ ���� � ��������, � ����� �� ������ �����.
     */
    private Path pathName;

    /**
     * ����������� �� �����. ������� ����, � ����� �� ��������� �����, ��� ��� �������� �� ����� ����������.
     *
     * @param fileName ��� � �������� � ����� �� �����.
     * @throws IOException ��������� �� ������ � �������.
     */
    public WriteFile(String fileName) throws IOException {
        super(fileName);
        checkFile(fileName);
        if(Files.exists(pathName)) {
            fileWriter = new FileWriter(getFile());
        }
    }

    /**
     * ����� �� ������ �� �������� �� �����.
     *
     * @return ������������, ��������� �������� �� �����.
     */
    public Path getPathName(){
        return pathName;
    }

    /**
     * �������� �� ����������� ����� �� ����������� ����. ������� �������� �� ����� ���� � �������� �� fileName
     * � ����������� ���� �� ����������. Ako ����������, ����������� ���� ������ � �������� ������� ���
     * ���� ����������.
     *
     * @param fileName ������ � ��� �� �����
     * @throws IOException ��������� �� ������ � �������
     */
    @Override
    public void checkFile(String fileName) throws IOException {
        String path=fileName.substring(0, fileName.lastIndexOf("\\"));
        pathName=Paths.get(path);

        if(Files.exists(pathName)) {
            if (getFile().createNewFile()) {
                System.out.println("������ � �������� �������\n");
            } else {
                System.out.println("������ ���� ����������. ������� �� ��������� �������\n");
            }
        }
    }

    /**
     * ����� �� ��������� �� ������� ��� ����.
     *
     * @param content �����, ����� ������ �� �������
     * @throws IOException ��������� �� ������ � �������
     */
    public void action(String content) throws IOException {
        fileWriter.write(content);
        fileWriter.close();
    }
}
