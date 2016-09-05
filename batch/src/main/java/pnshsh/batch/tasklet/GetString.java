package pnshsh.batch.tasklet;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class GetString implements Tasklet {

	@Override
	public RepeatStatus execute(StepContribution arg0, ChunkContext arg1) throws Exception {
		
		System.out.println(arg1.getStepContext().getStepExecution().getJobExecution().getExecutionContext().get("key"));
		return RepeatStatus.FINISHED;
		
	}

}
